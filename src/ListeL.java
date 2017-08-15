
public class ListeL {

	private static class ElementL {
		private int inhalt;
		private ElementL next;
	}

	private ElementL head;

	public void bubbleSort() { // Sortieren durch vertauschen
		int lange = 0;
		int durchlauf = 0;
		ElementL temp = head;
		int count = 0;
		do {
			count = 0;
			while (temp.next != null) {
				if(temp.inhalt > temp.next.inhalt) {
					int inhalt1 = temp.inhalt;
					temp.inhalt = temp.next.inhalt;
					temp.next.inhalt = inhalt1;
					count++;
				}
				temp = temp.next;
			}
			temp = head;
		} while(count != 0);
	}

	public void einfuegen(int neuInhalt) {
		ElementL temp = new ElementL();
		temp.inhalt = neuInhalt;

		if (head == null) {
			head = temp;
		} else {
			temp.next = head;
			head = temp;
		}
	}

	public void auslesen() {

		ElementL temp = head;

		while (temp != null) {
			System.out.println(temp.inhalt);
			temp = temp.next;
		}

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListeL liste = new ListeL();
		liste.einfuegen(2010);
		liste.einfuegen(18);
		liste.einfuegen(8);
		liste.einfuegen(2000);
		liste.einfuegen(28);
		liste.einfuegen(1998);
		liste.einfuegen(2005);
		liste.einfuegen(1997);
		liste.einfuegen(1993);
		liste.einfuegen(19);
		liste.einfuegen(12);
		liste.einfuegen(2016);

		liste.bubbleSort();
		liste.auslesen();
	}

}
