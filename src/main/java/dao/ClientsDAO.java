package dao;

import java.util.Collection;
import entities.Client;
import entities.Person;

public interface ClientsDAO {
    int insertClient(Person pPerson);
    boolean deleteClient(Person pPerson);
    Person findClient(int pClientId);
    boolean updateClient(Person pPerson);
    Collection<Client> selectClients();
}
