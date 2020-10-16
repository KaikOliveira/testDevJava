/*
import React from 'react';

import { makeStyles } from '@material-ui/core/styles';
import Paper from '@material-ui/core/Paper';
import Grid from '@material-ui/core/Grid';


export default function Lista(){
    return(

        <div className={classes.root}>
      <Grid container spacing={1}>
        <Grid container item xs={12} spacing={3}>
          <FormRow />
        </Grid>
        <Grid container item xs={12} spacing={3}>
          <FormRow />
        </Grid>
        <Grid container item xs={12} spacing={3}>
          <FormRow />
        </Grid>
      </Grid>
      </div>
    );

}

*/

import React from 'react';
import { makeStyles } from '@material-ui/core/styles';
import Paper from '@material-ui/core/Paper';
import Grid from '@material-ui/core/Grid';

const useStyles = makeStyles((theme) => ({
  root: {
    flexGrow: 1,
  },
  paper: {
    padding: theme.spacing(2),
    textAlign: 'center',
    color: theme.palette.text.secondary,
  },
}));

export default function Lista() {
  const classes = useStyles();

  function FormRow() {
    return (
      <React.Fragment>
        <Grid item xs={2}>
          <Paper className={classes.paper}>Codigo</Paper>
        </Grid>
        <Grid item xs={2}>
          <Paper className={classes.paper}>Nome</Paper>
        </Grid>
        <Grid item xs={2}>
          <Paper className={classes.paper}>Excluir</Paper>
        </Grid>
        <Grid item xs={2}>
          <Paper className={classes.paper}>Alterar</Paper>
        </Grid>
        <Grid item xs={2}>
          <Paper className={classes.paper}>Exibir no Mapa</Paper>
        </Grid>
      </React.Fragment>
    );
  }

  return (
    <div className={classes.root}>
      <Grid container spacing={1}>
        <Grid container item xs={8} spacing={1}>
          <FormRow />
        </Grid>
        <Grid container item xs={8} spacing={1}>
          <FormRow />
        </Grid>
        <Grid container item xs={8} spacing={1}>
          <FormRow />
        </Grid>
        
      </Grid>
    </div>
  );
}
