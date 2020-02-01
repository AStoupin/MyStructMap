import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.Mappings;
import org.mapstruct.factory.Mappers;
 
@Mapper
public interface MyMapInterface {
	MyMapInterface INSTANCE = Mappers.getMapper( MyMapInterface.class );
	
	@Mappings( {
		@Mapping(target = "field2", expression = "java(src.field2+\"!\")"),
		@Mapping(target = "field3", source="field3", dateFormat="dd.MM.yyyy")
	})
    MyDestClass sourceToDest(MySourceClass src); 
}
