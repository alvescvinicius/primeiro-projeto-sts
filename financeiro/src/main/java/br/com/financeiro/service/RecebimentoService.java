package br.com.financeiro.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.stereotype.Service;

import br.com.financeiro.data.vo.RecebimentoVO;

@Service
public class RecebimentoService {

	public List<RecebimentoVO> findAll() {
		
		System.out.println(new Date() + " -> RecebimentoService.findAll()");
		
		List<RecebimentoVO> recebimentos = new ArrayList<RecebimentoVO>();

		for (int i = 1; i <= 10; i++) {

			RecebimentoVO x = new RecebimentoVO();
			
			x.setKey((long) i);
			x.setDescription("Desc " + 1);
			x.setValor(100.00 + i);
			x.setDataRecebimento(new Date());
			x.setDataInclusao(new Date());
			x.setUsuario("developer");

			recebimentos.add(x);

		}
		
		
		return recebimentos;
	}

}
