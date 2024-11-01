package keyin.librarymanagement.Service;

import keyin.librarymanagement.entity.Author;
import keyin.librarymanagement.Repository.LibraryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LibraryService {
    @Autowired
    private LibraryRepository libraryRepository;

    public Author createLibrary(Author library) {
        return libraryRepository.save(library);
    }

    public List<Author> getAllLibraries() {
        return libraryRepository.findAll();
    }

    public Author getLibraryById(Long id) {
        return libraryRepository.findById(id).orElse(null);
    }

    public void deleteLibrary(Long id) {
        libraryRepository.deleteById(id);
    }
}
