package springBootControler;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.springBoot.exception.DataNotFoundException;

import addressPojo.AddressPojo;

@RestController
@RequestMapping("order-service")
public class AddressControler {
	
	@RequestMapping(value = "/orders/{orderId}/address", method = RequestMethod.PUT)
	public ResponseEntity UpdateData(@PathVariable Integer orderId, @RequestBody AddressPojo address) {
		
		
		AddressPojo addressPojo =new AddressPojo();
		addressPojo.setId(orderId);
		addressPojo.setAddress(address.getAddress());
		addressPojo.setCity(address.getCity());
		addressPojo.setState(address.getState());
		System.out.println(addressPojo.getAddress());
		if (address.getAddress()==null) {
			  throw new DataNotFoundException("Address Code Not Found");
		}
		
		/*another REST service calling
		
		RestTemplate restTemplate=new RestTemplate();
		restTemplate.getForEntity("another REST service calling url", String.class);
		
		*/
		
			return new ResponseEntity<AddressPojo>(addressPojo, HttpStatus.OK);
		
	}
}
