package be.cvo.b4.person.service.mapper;

import java.util.ArrayList;
import java.util.List;

public abstract class AbstractMapper<D, B> implements IMapper<D, B> {

	@Override
	public List<D> mapToDTO(List<B> bs) {
		if(bs == null)
			return null;
		List<D> temp = new ArrayList<D>();
		for(B b : bs){
			temp.add(mapToDTO(b));
		}
		return temp;
	}

	@Override
	public List<B> mapToBus(List<D> ds) {
		if(ds == null)
			return null;
		List<B> temp = new ArrayList<B>();
		for(D d : ds){
			temp.add(mapToBus(d));
		}
		return temp;
	}

}
