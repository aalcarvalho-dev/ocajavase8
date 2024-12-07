package iteracao;
import java.util.List;
import java.util.ArrayList;
public class Iteracao{
	public static void main(String[] args){
		float fishS[] = {1.9f, 2.8f, 13.1f, 29.2f, 35.3f};

		for(int i=0; i<fishS.length; i++){
			System.out.println("Valor: "+fishS[i]);
		}
		//fishL=[1.9];
		List<Float> fishL = new ArrayList<Float>();
		fishL.add(1.9f);
		fishL.add(13.1f);
		fishL.add(29.5f);

		Float tamReq = 28.f;

		for(Float tamanho : fishL){
			if(tamanho > tamReq){
				System.out.println("Tamanho: "+tamanho);
			}
		}
	}
}
