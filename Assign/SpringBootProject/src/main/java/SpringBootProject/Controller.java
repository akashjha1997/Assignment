package SpringBootProject;

import java.util.List;

import org.apache.logging.log4j.util.Strings;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	EntityDao eDao = new EntityDao();

	@GetMapping("/employees")
	public List<EmployeeEntity> getdata() {
		eDao.saveData();
		return eDao.getDetails();
	}

	@GetMapping("/deleteEmployee/{id}")
	public String delete(@PathVariable int id) {
		eDao.saveData();
		return eDao.deleteDetails(id);
	}

	@GetMapping("/listAllEmployees")
	public List<EmployeeEntity> getdataBasedOnRoles(@RequestHeader("Role") String roles) throws Exception {

		if (Strings.isBlank(roles)) {
			throw new Exception("Empty role");
		}

		else if (roles.equalsIgnoreCase("Admin")) {
			eDao.saveData();

			return eDao.getDetails(roles);
		} else {
			throw new Exception(roles+" not allowed");
		}
	}
}
