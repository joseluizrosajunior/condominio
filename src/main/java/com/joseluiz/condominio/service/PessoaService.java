package com.joseluiz.condominio.service;

import com.joseluiz.condominio.models.Pessoa;
import com.joseluiz.condominio.utils.GenericDao;

import javax.ejb.Stateless;
import javax.ejb.TransactionAttribute;
import javax.ejb.TransactionAttributeType;
import javax.inject.Inject;

@Stateless
@TransactionAttribute(TransactionAttributeType.SUPPORTS)
public class PessoaService extends AbstractService<Pessoa> {

    @Inject
    private GenericDao<Pessoa> daoPessoa;

    @Override
    protected GenericDao<Pessoa> getDao() {
        return daoPessoa;
    }
}
