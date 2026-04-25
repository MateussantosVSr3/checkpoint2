package br.com.fiap3ESR.checkpoint2.service; // Substitua *** pelo código da sua turma

import br.com.fiap3ESR.checkpoint2.model.Pedido;
import br.com.fiap3ESR.checkpoint2.repository.PedidoRepository;
import jakarta.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.EmptyResultDataAccessException;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PedidoService {

    @Autowired
    private PedidoRepository pedidoRepository;


    public Pedido createPedido(Pedido pedido) {
        return pedidoRepository.save(pedido);
    }


    public List<Pedido> readAllPedidos() {
        return pedidoRepository.findAll();
    }


    public Pedido readPedidoById(Long id) {
        return pedidoRepository.findById(id).orElseThrow(() ->
                new EntityNotFoundException("Pedido não encontrado com o ID: " + id));
    }


    public Pedido updatePedido(Long id, Pedido pedidoAtualizado) {
        return pedidoRepository.findById(id).map(pedidoExistente -> {
            pedidoExistente.setClienteNome(pedidoAtualizado.getClienteNome());
            pedidoExistente.setValorTotal(pedidoAtualizado.getValorTotal());
            return pedidoRepository.save(pedidoExistente);
        }).orElseThrow(() -> new EntityNotFoundException("Pedido não encontrado com o ID: " + id));
    }


    public void deletePedidoById(Long id) {
        try {
            pedidoRepository.deleteById(id);
        } catch (EmptyResultDataAccessException e) {
            throw new EntityNotFoundException("Pedido não encontrado com o ID: " + id);
        }
    }
}