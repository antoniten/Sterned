package Homeworks;

public class mainpart {
	public static void main(String[] args) {
		nonopart standart  = new nonopart();
		nopart kordon = new nopart();
		nononopart svalka = new nononopart();
		if (standart.getmainquestlocation() == svalka.getmainquestlocation() ){
			System.out.println("���������� ���������� �� ������� "+svalka.Getloc2name()+" = "+svalka.NumArtefact());
			System.out.println(svalka.Getname()+"������� " + svalka.Getloc2name()+ " �� ������������� � �������� ������ ����");
			System.out.println("��������� ���������� 1��, 2�� � 3�� ����� ��������, ����������� �� ������ ����������: "+svalka.numbermutants(4, 5, 8)+" ������");
			System.out.println("��������� ���������� 1�� � 2�� ����� ��������, ����������� �� ������ ����������: "+svalka.numbermutants(4, 5)+" ������");
		}
		System.out.println();
		if (kordon.getmainquestlocation() == false){
			System.out.println("���������� ���������� �� ������� "+kordon.Getloc1name()+" = "+kordon.NumArtefact());
			System.out.println(kordon.Getname()+"������� " + kordon.Getloc1name()+ " �� ������������� � �������� ������ ����");
		}
	}
}
