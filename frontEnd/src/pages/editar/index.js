import React from 'react';

import './styles.css';
import '../../pages/global.css';

class Edit extends React.Component {
   
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

   render(){
      return(
         <div className="screenEdit">
            <div id="conteiner">
               <div id="header" > 
                  <p>Sistema Teste Desenvolvedor Java - Versão 1.5 </p>
               </div>
   
               <div className="nav">
                  <p>Home</p> <p>/</p> <p>Subestação</p> <p>/</p> <p id="select">Alteração</p>
               </div>
   
               <div className="subTitle">
                  <p>Subestação</p>
               </div>
   
               <div className="sub">
                  <ul>
                    {this.state.subestacoes.map(item => (
                        <li key={item.id_subestacao}>
                           <p><b>Codigo:</b> {item.codigo}</p>
                           <p><b>Nome:</b> {item.nome}</p>
                           <p><b>Latitude:</b> {item.latitude}</p>
                           <p><b>Longitude:</b> {item.longitude}</p>
                        </li>
                    ))}
                  </ul>
               </div>
            </div>
         </div>
      );
   }
}
   
export default Edit;