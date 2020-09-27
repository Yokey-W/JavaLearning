package Memory;

import java.util.ArrayList;
import java.util.List;
import java.util.UUID;
public class OutOfMemroy {
	public static void main(String args[]){
		List<UUID> list = new ArrayList<UUID>();
		while(true){
			list.add(UUID.randomUUID());
		}
	}

}
