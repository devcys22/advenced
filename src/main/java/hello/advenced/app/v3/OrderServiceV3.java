package hello.advenced.app.v3;

import hello.advenced.trace.TraceId;
import hello.advenced.trace.TraceStatus;
import hello.advenced.trace.hellotrace.HelloTraceV2;
import hello.advenced.trace.logtrace.LogTrace;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class OrderServiceV3 {

    private final LogTrace trace;
    private final OrderRepositoryV3 orderRepository;

    public void orderItem(String itemId){

        TraceStatus status = null;
        try {
            status = trace.begin("OrderService.orderItem()");
            orderRepository.save(itemId);
            trace.end(status);

        }catch ( Exception e){
            trace.exception(status, e);
            throw e;
        }
    }
}
