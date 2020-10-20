import React from 'react';
import { Link } from 'react-router-dom';

import { FaGlobeAmericas } from 'react-icons/fa';
import { MdEdit } from 'react-icons/md';
import { FiAlertTriangle } from 'react-icons/fi';
import { VscDebugRestart } from 'react-icons/vsc'
import '../../pages/global.css';
import './listaStyle.css';
import './error.css';

import RefreshPage from './reload';

class Lista extends React.Component {
    state = {
        subestacoes: []
    }; 

  componentDidMount() {
     fetch('http://localhost:8080/api/cadastros')
          .then(res => res.json())
          .then(res => {
          this.setState({
        subestacoes: res
      });
    });
  }

    render() {
        
        let content = <div className="screenLogin">
          <div id="aviso">
            <div id="text">
              <div id="errorRow">
                <p>Aviso</p><FiAlertTriangle size={25} color="#000" />
              </div>
              <div id="errorDes">
                <p>Conexão com api falhou!</p>
              </div>
            </div>
            <Link  onClick={RefreshPage} refresh="true">
              <div id="reloading">  
                <p>Tente novamente <VscDebugRestart size={14} /> </p>
              </div>
            </Link>
          </div>
        </div>

      if (this.state.subestacoes.length !== 0) {
        content = (
            
      <div id="conteiner">
        
        <div id="header" > 
           <p>Sistema Teste Desenvolvedor Java - Versão 1.5</p>
        </div>
                    
          <div id="list-titulo">
            <h2>Subestações</h2>
          </div>
            <div id="list">
            <ul>
              <li>
                  <div id="row-cabe">

                    <div id="row-cabe-cod">
                      <p>Codigo</p>
                    </div>

                    <div id="row-cabe-nome">
                      <p>Nome</p>
                    </div>

                    <div id="row-cabe-excluir">
                      <p>Excluir</p>
                    </div>

                    <div id="row-cabe-edit">
                      <p>Editar</p>
                    </div>

                    <div id="row-cabe-map">
                     <p>Exibir no mapa</p>
                    </div>

                  </div>

              </li>
            {this.state.subestacoes.map(item => (
   
                <li key={item.id_subestacao}>
                  <div id="row">

                    <div id="row-cod">     
                      <p> {item.codigo}</p>
                    </div>

                    <div id="row-nome">
                     <p> {item.nome}</p>
                    </div>

                    <div id="row-excluir">
                      <Link to="/delete">
                        <p>excluir</p>
                      </Link>
                    </div>

                    <div id="row-edit">
                      <Link to="/edit">
                        <MdEdit size={17} color="#000" />
                      </Link>
                    </div>

                    <div id="row-map">
                      <Link to="/map">
                        <FaGlobeAmericas size={17} color="#000" />
                      </Link>
                    </div>
                  </div>

                </li> 
              ))}
            </ul>  
            </div>
              <div id="buttom">
                <Link to="/addsub">
                  incluir
                </Link>
              </div>
          </div>
        
            
      )
    }

    return (
      <div id="page-list">

        {content}
      </div>
       
    );
       
  }
}

export default Lista;

