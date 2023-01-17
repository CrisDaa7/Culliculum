/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aly.parking.util;

/**
 * @author Usuario
 * @version 1.0
 * @created 16-ene.-2023 17:00:22
 */
public class Cliente extends Persona {

	public Vehiculo vehiculoList;

	public Cliente(){

	}

	public boolean estacionarCarro(){
		return false;
	}

	public boolean recibirComprobante(){
		return false;
	}
}