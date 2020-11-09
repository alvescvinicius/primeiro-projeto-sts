package br.com.financeiro.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.financeiro.data.vo.RecebimentoVO;
import br.com.financeiro.service.RecebimentoService;
import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/recebimento/v1")
public class RecebimentoController {
	
	@Autowired
	private RecebimentoService service;
	
	@ApiOperation(value = "Lista Recebimentos" ) 
	@GetMapping(produces = { "application/json", "application/xml", "application/x-yaml" })
	public List<RecebimentoVO> findAll() {
		List<RecebimentoVO> recebimentos =  service.findAll();
		return recebimentos;
	}	

}
