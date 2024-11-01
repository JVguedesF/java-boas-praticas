package br.com.alura.adopet.api.validacoes;

import br.com.alura.adopet.api.dto.SolicitacaoAdocaoDto;
import br.com.alura.adopet.api.exception.ValidacaoException;

public interface ValidacaoSolicitacaoAdocao {
    void validar(SolicitacaoAdocaoDto dto) throws ValidacaoException;
}
