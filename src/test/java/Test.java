
import com.Model.Product;
import com.dao.ProductDao;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.when;

//mvn test -Dtest=testJ5
@ExtendWith(MockitoExtension.class)
public class Test {
    ProductDao productDao = Mockito.spy(ProductDao.class);


    @org.junit.jupiter.api.Test
    public void testAdd() {
        Product result = new Product("razer viper", "Техника", 5,500);
        when(productDao.findByName("razer viper")).thenReturn(result);
    }

}

