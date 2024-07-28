package programmerzamannow.spring.core.scope;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.config.Scope;

import java.util.ArrayList;
import java.util.List;

// belajar membuat scope
public class DoubletonScope implements Scope {
    private List<Object> objects = new ArrayList<>(2);

    private Long counter = -1L;

    @Override
    public Object get(String name, ObjectFactory<?> objectFactory) {
        counter++;

        if (objects.size()==2){
            // kita cek counternya lalu konfersi jadi interger dibagi 2
            int index = (int) (counter % 2);
            // kita ambil objectnya dari list Arraylist yang di atas
            return  objects.get(index);
        }else {
            // dia menggunakan object baru , yaitu objectFactory
            Object object = objectFactory.getObject();
            // kita masukan kedalam si objectnya
            objects.add(object);
            // lalu kita returnkan si objectnya
            return object;
        }
    }

    @Override
    public Object remove(String name) {
        if (!objects.isEmpty()){
            // kita hapus
            return objects.remove(0);
        }
        return null;
    }

    @Override
    public void registerDestructionCallback(String name, Runnable callback) {

    }

    @Override
    public Object resolveContextualObject(String key) {
        return null;
    }

    @Override
    public String getConversationId() {
        return null;
    }
}
