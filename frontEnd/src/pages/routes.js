import React from 'react';
import { BrowserRouter, Switch, Route} from 'react-router-dom';

import Inicio from './inicio/index';
import Lista from './lista/lista';
import Edit from './editar/index';

function Routes () {
    return(
        <BrowserRouter>
            <Switch>
                <Route path="/" exact component={Inicio} />
                <Route path="/lista" component={Lista} />
                <Route path="/edit" component={Edit} />
            </Switch>
        </BrowserRouter>
    );
}

export default Routes;