package keyin.librarymanagement.Entity;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Library {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    private Integer totalBooks;

    @OneToMany(mappedBy = "library", cascade = CascadeType.ALL)
    private List<Book> books;

    @OneToMany(mappedBy = "library", cascade = CascadeType.ALL)
    private List<Member> members;

    // Getters and Setters
}
