package hello.advenced.app.v0;

import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceV0 {

    private final OrderRepositoryV0 orderRepository;

    public void orderItem(String itemId){
        //실무에서는 여기 복잡한 비즈니스 로직이 존재한다.
        orderRepository.save(itemId);
    }
}
