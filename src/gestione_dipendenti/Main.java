package gestione_dipendenti;

import java.util.*;

/*Si vuole realizzare un insieme di classi per la gestione del personale di un’istituzione. 
Ogni persona che lavora nell’istituzione è caratterizzata da un nome, un indirizzo ed un
numero di telefono. Deve essere possibile in qualsiasi momento ottenere una rappresentazione
di un membro del personale sotto forma di stringa o calcolare la sua paga. 
Nell’istituzione esistono due tipologie di personale, i volontari e i dipendenti. I dipendenti
sono caratterizzati, oltre che dalle informazioni precedentemente indicate
per tutto il personale, anche da un codice fiscale e da una base di retribuzione. 
Un volontario percepisce una paga pari a 0, un dipendente percepisce una paga pari alla
base di retribuzione. I dipendenti a loro volta possono essere, giornalieri o impiegati. 
I giornalieri sono caratterizzati anche dalle giornate lavorative svolte e la loro paga è calcolata
moltiplicando la loro base di retribuzione per il numero di giorni in cui hanno lavorato. Gli impiegati 
sono caratterizzati dal numero di bonus maturati e la loro paga è calcolata
sommando i bonus maturati alla base di retribuzione Infine aggiungiamo che se 
necessario si può organizzare il personale in gruppi o staffs. Nella realizzazione delle classi in Java gestire*/

public class Main {

	public static void main(String[] args) {
		
		Volontari tizio2=new Volontari("Carlo", "Via Bau", "0766854426", "fgsijepofishj03u44");
		
		DipendenteGiornaliero tiziogiorn=new DipendenteGiornaliero("Marco", "Via ciao", "0766892647", "frondegtmaadn389357", 10.25, 8, 25);
		
		DipendenteImpiegato tizioimp=new DipendenteImpiegato("Antonio", "Piazza roma", "076658425", "skjfn3u73yt4kjrf", 1000, 250);
		
		ArrayList staff = new ArrayList();
		staff.add(tiziogiorn.stampaDettagli());
		staff.add(tizioimp.stampaDettagli());
		staff.add(tizio2.stampaDettagli());
		
		for(int i=0;i<staff.size();i++) {
			System.out.println(staff.get(i));
		}

	}

}
