/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

import java.util.Timer;
import java.util.TimerTask;
import repository.UsuarioRepository;

/**
 *
 * @author Clara
 */
public class Application {

    public static void main(String[] args) {

        UsuarioRepository usuarioRepository = new UsuarioRepository();

        System.out.println("Olá! Você conseguiu acessar a applicação Java na EC2!");

        usuarioRepository.inserirDadosUsuario();
    }

}
