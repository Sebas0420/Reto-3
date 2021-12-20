package com.ciclo4.reto;


import com.ciclo4.reto.interfaces.InterfaceOrder;
import com.ciclo4.reto.interfaces.InterfaceUser;
import com.ciclo4.reto.modelo.Vegetarian;
import com.ciclo4.reto.modelo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Component;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.List;
import com.ciclo4.reto.interfaces.InterfaceVegetarian;


@Component
@SpringBootApplication

/**
**
*/
public class RetoApplication implements CommandLineRunner {
	@Autowired
	private InterfaceVegetarian interfaceVegetarian;
	@Autowired
	private InterfaceUser interfaceUser;
	@Autowired
	private InterfaceOrder interfaceOrder;
	public static void main(String[] args) {
		SpringApplication.run(RetoApplication.class, args);
	}
	@Override
	public void run(String... args) throws Exception {
		interfaceVegetarian.deleteAll();
		interfaceUser.deleteAll();
		interfaceOrder.deleteAll();

		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("yyyy-MM-dd");
	interfaceUser.saveAll(
				List.of(
						new User(1, "123123", "JUAN PARRA",ft.parse("1966-11-15"),"11", "CR 34-45", "311222222", "juancasomoza@hotmail.com", "123", "ZONA 1", "ADM"),
						new User(2, "61123211", "NAPOLEON BONAPARTE", ft.parse("1966-11-15"), "11", "CR 34-45", "3168965645", "nbonaparte@gmail.com", "123", "ZONA 2", "COORD"),
						new User(3, "46669989", "BLODY MARRY", ft.parse("1996-11-15"), "11", "CR 34-45", "3174565625", "stellez@gmail.com", "123", "ZONA 2", "ASE"),
						new User(4, "52369563", "JUANA DE ARCO", ft.parse("1987-05-15"), "05", "CR 34-45", "3265632", "jdarco@gmail.com", "123", "ZONA 2", "ASE"),
						new User(5, "123456789", "ALCIRA LA ALPACA", ft.parse("1966-02-15"), "02", "CR 34-45", "3168965645", "aalpaca@gmail.com", "123", "ZONA 1", "COORD"),
						new User(6, "213456789", "PEDRO CAPAROSA", ft.parse("1966-02-15"), "02", "CR 34-45", "3168965645", "pcaparosa@gmail.com", "123", "ZONA 1", "ASE"),
						new User(7, "312456789", "LUIS IXV UN SOL", ft.parse("1966-02-15"), "02", "CR 34-45", "3168965645", "reysol@gmail.com", "123", "ZONA 1", "ASE")
                )
		);

		interfaceVegetarian.saveAll(List.of(new Vegetarian("AP-903", "MARCA 1", "CATEGORIA 1", "Descripción", true, 150000, 10, "https://i.ibb.co/0B5K7fp/GOLD-STANDARD-WHEY-2-LB-chocolate.png"),
						new Vegetarian("AP-904", "MARCA 2", "CATEGORIA 2", "Descripción", true, 170000, 20, "https://i.ibb.co/qkJZ8tL/Intenze.jpg"),
						new Vegetarian("AP-905", "MARCA 3", "CATEGORIA 2", "Descripción: CALIDAD, ECOMIA, PRE ENTRENO", true, 150000, 15, "https://i.ibb.co/FmKk9Dn/micronized.png"),
						new Vegetarian("AP-906", "MARCA 4", "CATEGORIA 3", "Descripción: AUMENTO DE MASA MUSCULAR", true, 120000, 15, "https://i.ibb.co/N9HjW5Q/creatine.png")
				)
		);
	}

}