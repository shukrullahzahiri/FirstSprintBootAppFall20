package keyin.librarymanagement.Repository;

import keyin.librarymanagement.entity.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Author, Long> {}
