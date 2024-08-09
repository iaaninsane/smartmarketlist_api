package listaprodutos;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/listas")
public class ListaProdutosController {
	
	private ListaProdutosService listaProdutosService;

	public ListaProdutosController(ListaProdutosService listaProdutosService) {
		
		this.listaProdutosService = listaProdutosService;
	}

	
}
