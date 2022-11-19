package menu;

import java.text.ParseException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Scanner;
import model.services.FileConverter;

import model.structures.Person;
import model.structures.PersonAVLTree;

public class Tela {

	public static void imprime() throws ParseException {
		List<Person> people = FileConverter.toPeopleList();
        List<Integer> indexes = new ArrayList<>();
		
		PersonAVLTree<Long> cpf = new PersonAVLTree<>();
		PersonAVLTree<Date> data = new PersonAVLTree<>();
		PersonAVLTree<String> nome = new PersonAVLTree<>();

		for (int i = 0; i < people.size(); i++) {
			cpf.add(people.get(i).getCPF(), i);
			data.add(people.get(i).getBirthDay(), i);
			nome.add(people.get(i).getName().toLowerCase(), i);
		}
        
        boolean exit = false;
        do {
            System.out.println("Digite 1 para buscar CPF");
            System.out.println("Digite 2 para buscar por NOME");
            System.out.println("Digite 3 para buscar DATA DE NASCIMENTO");

            Scanner entrada = new Scanner(System.in);
            int base = entrada.nextInt();

            switch (base) {
                case 1:
        
                    System.out.println("Digite o CPF:");
                    Scanner cpfInput = new Scanner(System.in);
                    long cpfPessoa = cpfInput.nextLong();
        
                    indexes = cpf.searchForKey(cpfPessoa);
                    
                    if (indexes.isEmpty()) {
                        System.out.println("No one has this name.");
                    } else {
                        for(int index : indexes) {
                            System.out.println(people.get(index));
                        }
                    }
                    
                    indexes.clear();
                    
        
                    break;
                case 2:
        
                    System.out.println("Digite o Nome:");
                    Scanner nameInput = new Scanner(System.in);
                    String name = nameInput.nextLine();
        
                    indexes = nome.lookForTheString(name);

                    if (indexes.isEmpty()) {
                        System.out.println("No one has this Name.");
                    } else {
                        for(int index : indexes) {
                            System.out.println(people.get(index));
                        }
                    }
                    indexes.clear();
        
                    break;
                case 3:
        
                    System.out.println("Digite a primeira data:");
                    Scanner dateInitialInput = new Scanner(System.in);
                    String date = dateInitialInput.nextLine();
                    System.out.println("Digite a segunda data:");
                    Scanner dateFinalInput = new Scanner(System.in);
                    String dateFinal = dateFinalInput.nextLine();
        
                    indexes = nome.lookForDate(date, dateFinal);
                    if (indexes.isEmpty()) {
                        System.out.println("No one was born bwtween this dates.");
                    } else {
                        for(int index : indexes) {
                            System.out.println(people.get(index));
                        }
                    }
                    indexes.clear();
        
                default:
                    exit = true;
                }

        } while (!exit);
	}

    

}