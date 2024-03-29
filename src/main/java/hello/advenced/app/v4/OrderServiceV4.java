package hello.advenced.app.v4;

import hello.advenced.trace.TraceStatus;
import hello.advenced.trace.logtrace.LogTrace;
import hello.advenced.trace.template.AbstractTemplate;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceV4 {

    private final LogTrace trace;
    private final OrderRepositoryV4 orderRepository;

    public void orderItem(String itemId){

        AbstractTemplate<Void> template = new AbstractTemplate<>(trace) {
            @Override
            protected Void call() {
                orderRepository.save(itemId);
                return null;
            }
        };
         template.execute("OrderService.orderItem()");
    }
}
