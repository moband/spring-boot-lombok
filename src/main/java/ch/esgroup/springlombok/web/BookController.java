package ch.esgroup.springlombok.web;

import ch.esgroup.springlombok.model.BookDto;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/books")
public class BookController {



  @PostMapping
  public void create(@RequestBody BookDto request) {

    System.out.println(request.getAuthors());
  }


}
