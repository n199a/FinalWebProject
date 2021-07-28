package by.tarasiuk.ct.model.service;

import by.tarasiuk.ct.entity.Token;
import by.tarasiuk.ct.exception.ServiceException;

import java.util.Optional;

public interface TokenService {
    boolean createToken(long accountId) throws ServiceException;

    Optional<Token> findTokenByAccountId(long accountId) throws ServiceException;

    void confirmTokenById(long tokenId) throws ServiceException;
}
