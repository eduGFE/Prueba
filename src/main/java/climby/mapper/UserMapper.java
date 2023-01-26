package climby.mapper;

import com.climbtogether.climby.domain.User;
import com.climbtogether.climby.dto.UserDTO;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;


@Mapper(componentModel = "spring")
public interface UserMapper {
	

	@Mapping(target ="id_user",source= "id")
	User userDTOToUser(UserDTO userDTO);
	

	@Mapping(source ="id_user",target= "id")
	UserDTO userToUserDTO(User user);

	

}
