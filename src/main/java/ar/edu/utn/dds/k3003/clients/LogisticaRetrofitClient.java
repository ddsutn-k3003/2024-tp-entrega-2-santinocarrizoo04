package ar.edu.utn.dds.k3003.clients;

import ar.edu.utn.dds.k3003.facades.dtos.TrasladoDTO;
import retrofit2.Call;
import retrofit2.http.GET;
import java.util.List;

public interface LogisticaRetrofitClient {
    @GET("traslados/findByColaboradorId")
    Call<List<TrasladoDTO>> findByTraslado(Long id);

}
