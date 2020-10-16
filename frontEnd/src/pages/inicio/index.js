import React from 'react';
import { Link } from 'react-router-dom';

import './styles.css';
import '../../pages/global.css';


export default function Inico(){
    return(
        <>
        <div id="page">
            <div className="wrapper">
                <div id="header" > 
                    <p>Sistema Teste Desenvolvedor Java - Versão 1.5 </p>
                </div>

                <div id="forms">
                    <form>
                        <div id="user">
                            <label>Usuario:</label> <input type="text" name="usuario" placeholder="Digite seu Usuario" />
                        </div>
                        <div id="senha">
                            <label>Senha:</label> <input type="text" name="senha"placeholder="Digite sua Senha" />
                        </div>
                        <Link to="/lista">
                            <input className="botao" type="submit" value="Entrar" />
                            </Link>
                    </form>

                </div>
            </div>
        </div>
        </>
    );
}