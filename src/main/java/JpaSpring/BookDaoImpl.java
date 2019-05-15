package JpaSpring;

import org.springframework.stereotype.Repository;

import javax.persistence.*;

@Repository
public class BookDaoImpl implements BookDao {

    @PersistenceUnit
    //It is a equal with Autowired
    private EntityManagerFactory emFactory;

    BookDaoImpl() {
    }

    public void save(Book book) {
        EntityManager entityManager = emFactory.createEntityManager();
        EntityTransaction tx = entityManager.getTransaction();
        tx.begin();
        entityManager.persist(book);
        tx.commit();
        entityManager.close();
    }

    public Book get(Long id) {
        EntityManager entityManager = emFactory.createEntityManager();
        Book book = entityManager.find(Book.class, id);
        entityManager.close();
        return book;
    }
}
