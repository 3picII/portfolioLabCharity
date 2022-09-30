package pl.coderslab.charity.converters;

import org.springframework.core.convert.converter.Converter;
import pl.coderslab.charity.category.Category;

import java.util.ArrayList;
import java.util.List;


public class StringToCategoryConverter
        implements Converter<String[], List<Category>> {

    @Override
    public List<Category> convert(String[] source) {
        List<Category> categories = new ArrayList<>();
        for(int i = 0; i < source.length; i++){
            String[] data = (source[i].split(","));
            Category category = new Category(
                    Integer.parseInt(data[0]),
                    data[1]
            );
            categories.add(category);
        }
        return categories;
    }
}
