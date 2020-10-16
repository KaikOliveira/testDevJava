import React from 'react';
import { BrowserRouter, Switch, Route} from 'react-router-dom';

import Inicio from './inicio/index';
import Lista from './lista/index';

function Routes () {
    return(
        <BrowserRouter>
            <Switch>
                <Route path="/" exact component={Inicio} />
                <Route path="/lista" component={Lista} />
            </Switch>
        </BrowserRouter>
    );
}

export default Routes;