public class ObjCliente{
   private  int id;
   private  int caja;
   private  int estado;
   private String nombre;
   private String motivo;
   
   public ObjCliente() {
   }

    public ObjCliente(int id, int caja, int estado, String nombre, String motivo) {
        this.id = id;
        this.caja = caja;
        this.estado = estado;
        this.nombre = nombre;
        this.motivo = motivo;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getCaja() {
        return caja;
    }

    public void setCaja(int caja) {
        this.caja = caja;
    }

    public int getEstado() {
        return estado;
    }

    public void setEstado(int estado) {
        this.estado = estado;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMotivo() {
        return motivo;
    }

    public void setMotivo(String motivo) {
        this.motivo = motivo;
    }

    






}