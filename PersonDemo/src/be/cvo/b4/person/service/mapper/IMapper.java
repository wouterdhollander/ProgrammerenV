package be.cvo.b4.person.service.mapper;

import java.util.List;

public interface IMapper<D, B> {
	
	List<D> mapToDTO(List<B> bs);
	List<B> mapToBus(List<D> ds);
	
	D mapToDTO(B b);
	B mapToBus(D d);

}
