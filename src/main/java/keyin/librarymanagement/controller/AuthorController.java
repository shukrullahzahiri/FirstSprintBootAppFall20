package keyin.librarymanagement.Controller;

import keyin.librarymanagement.entity.Author;
import keyin.librarymanagement.Service.LibraryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/libraries")
public class LibraryController {
    @Autowired
    private LibraryService libraryService;

    @GetMapping
    public List<Author> getAllLibraries() {
        return libraryService.getAllLibraries();
    }

    @PostMapping
    public Author createLibrary(@RequestBody Author library) {
        return libraryService.createLibrary(library);
    }

    @GetMapping("/{id}")
    public Author getLibraryById(@PathVariable Long id) {
        return libraryService.getLibraryById(id);
    }

    @DeleteMapping("/{id}")
    public void deleteLibrary(@PathVariable Long id) {
        libraryService.deleteLibrary(id);
    }
}
