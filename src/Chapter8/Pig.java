package Chapter8;

//tuong tu ke thua : extends  == implements

// dung implements con - interface cha : co the dung default them de tang do mem deo 
// -> co the dinh nghia them ham co the su dung truc tiep tu no  ma no khong can cac lop con ghi de lai
// neu ke thua tu nhieu lop ma trong so do no dinh nghia ten phuong thuc giong nhau thi ta nen dung key "super" de goi lop cha
// co the su dung phuong thuc static trong interface : giup tap trung 1 noi , kh can tao them doi tuong , giup do dong rong 1 interface : static KDL ten() {}

// * Chu y phan biet : khi nao can dung interface khi nao can dung abstract class 
// -> nen dung interface , khi nao kh con su dung duoc thi dung abstract class
public class Pig implements IAnimal {
	public void animalSound() {
		// The body of animalSound( ) is provided here
		System.out.println("The pig says: wee wee");
	}

	public void run() {
		// The body of sleep( ) is provided here
		System.out.println("Zzz");
	}
}
