package All;

public class Cofre {
    private int nota100;
    private int nota50;
    private int nota20;
    private int nota10;
    private int nota5;
    private int nota2;
    private int moeda1;
    private int moeda50;
    private int moeda25;
    private int moeda10;
    private int moeda5;
    
    private int auxNota100;
    private int auxNota50;
    private int auxNota20;
    private int auxNota10;
    private int auxNota5;
    private int auxNota2;
    private int auxMoeda1;
    private int auxMoeda50;
    private int auxMoeda25;
    private int auxMoeda10;
    private int auxMoeda5;
    
    public Cofre(){
        this.nota100 = 1;
        this.nota50  = 2;
        this.nota20  = 10;
        this.nota10  = 20;
        this.nota5   = 50;
        this.nota2   = 50;
        this.moeda1  = 100;
        this.moeda50 = 100;
        this.moeda25 = 50;
        this.moeda10 = 50;
        this.moeda5  = 50;
        
        this.auxNota100 = 0;
        this.auxNota50  = 0;
        this.auxNota20  = 0;
        this.auxNota10  = 0;
        this.auxNota5   = 0;
        this.auxNota2   = 0;
        this.auxMoeda1  = 0;
        this.auxMoeda50 = 0;
        this.auxMoeda25 = 0;
        this.auxMoeda10 = 0;
        this.auxMoeda5  = 0;
    }
    
    public void retirar_tudo(){
        this.nota100  = 0;
        this.nota50   = 0;
        this.nota20   = 0;
        this.nota20   = 0;
        this.nota10   = 0;
        this.nota5    = 0;
        this.nota2    = 0;
        this.moeda1   = 0;
        this.moeda50  = 0;
        this.moeda25  = 0;
        this.moeda10  = 0;
        this.moeda5   = 0;
    }
       
    public void retirar_item(int cod,int qtd){
        switch(cod){
            case 1:
                this.nota100 = this.nota100 - qtd;
                break;
            case 2:
                this.nota50 = this.nota50 - qtd;
                break;
            case 3:
                this.nota20 = this.nota20 - qtd;
                break;
            case 4:
                this.nota10 = this.nota10 - qtd;
                break;
            case 5:
                this.nota5 = this.nota5 - qtd;
                break;
            case 6:
                this.nota2 = this.nota2 - qtd;
                break;
            case 7:
                this.moeda1 = this.moeda1 - qtd;
                break;
            case 8:
                this.moeda50 = this.moeda50 - qtd;
                break;
            case 9:
                this.moeda25 = this.moeda25 - qtd;
                break;
            case 10:
                this.moeda10 = this.moeda10 - qtd;
                break;
            case 11:
                this.moeda5 = this.moeda5 - qtd;
                break;
            default:
                break;
        }
    }
    
    public void adicionar_item(int cod,int qtd){
        try{
            switch(cod){
                case 1:
                    this.nota100 = this.nota100 + qtd;
                    break;
                case 2:
                    this.nota50 = this.nota50 + qtd;
                    break;
                case 3:
                    this.nota20 = this.nota20 + qtd;
                    break;
                case 4:
                    this.nota10 = this.nota10 + qtd;
                    break;
                case 5:
                    this.nota5 = this.nota5 + qtd;
                    break;
                case 6:
                    this.nota2 = this.nota2 + qtd;
                    break;
                case 7:
                    this.moeda1 = this.moeda1 + qtd;
                    break;
                case 8:
                    this.moeda50 = this.moeda50 + qtd;
                    break;
                case 9:
                    this.moeda25 = this.moeda25 + qtd;
                    break;
                case 10:
                    this.moeda10 = this.moeda10 + qtd;
                    break;
                case 11:
                    this.moeda5 = this.moeda5 + qtd;
                    break;
                default:
                    break;
            }
            
        }catch(Exception e){
            System.out.println("Erro encontrado!!!");
        }
    }
    
    public boolean testar_troco(float preco,float vlr_pago){
        float troco = vlr_pago - preco;
        if(troco>=100f) 
            if((troco/100f)<= this.nota100){
                troco = troco%100f;
            }else{
                return false;
            }
        if(troco>=50f)
            if((troco/50f)<= this.nota50){
                troco = troco%50f;
            }else{
                return false;
            }
        if(troco>=20f)
            if((troco/20f)<= this.nota20){
                troco = troco%20f;
            }else{
                return false;
            }
        if(troco>=10f)
            if((troco/10f)<= this.nota10){
                troco = troco%10f;
            }else{
                return false;
            }
        if(troco>=5f)
            if((troco/5f)<= this.nota5){
                troco = troco%5f;
            }else{
                return false;
            }
        if(troco>=2f)
            if((troco/2f)<= this.nota2){
                troco = troco%2f;
            }else{
                return false;
            }
        if(troco>=1f)
            if((troco/1f)<= this.moeda1){
                troco = troco%1f;
            }else{
                return false;
            }
        if(troco>=0.5f)
            if((troco/0.5f)<= this.moeda50){
                troco = troco%0.5f;
            }else{
                return false;
            }
        if(troco>=0.25f)
            if((troco/0.25f)<= this.moeda25){
                troco = troco%0.25f;
            }else{
                return false;
            }
        if(troco>=0.1f)
            if((troco/0.1f)<= this.moeda10){
                troco = troco%0.10f;
            }else{
                return false;
            }
        if(troco>=0.05f)
            if((troco/0.05f)<= this.moeda5){
                troco = troco%0.05f;
            }else{
                return false;
            }
        return true;
    }

    public void descontar(float troco){
        try{
            if(troco>=100f){
                this.nota100 = (this.nota100 - (int) (troco/100f));
                troco = troco - ((int) (troco/100f) * 100f);
            }
            if(troco>=50f){
                this.nota50 = (this.nota50 - (int) (troco/50f));
                troco = troco - ((int) (troco/50f) * 50f);
            }    
            if(troco>=20f){
                this.nota20 = (this.nota20 - (int) (troco/20f));
                troco = troco - ((int) (troco/20f) * 20f);
            }
            if(troco>=10f){
                this.nota10 = (this.nota10 - (int) (troco/10f));
                troco = troco - ((int) (troco/10f) * 10f);
            }
            if(troco>=5f){
                this.nota5 = (this.nota5 - (int) (troco/5f));
                troco = troco - ((int) (troco/5f) * 5f);
            }
            if(troco>=2f){
                this.nota2 = (this.nota2 - (int) (troco/2f));
                troco = troco - ((int) (troco/2f) * 2f);
            }
            if(troco>=1f){
                this.moeda1 = (this.moeda1 - (int) (troco/1f));
                troco = troco - ((int) (troco/1f) * 1f);
            }
            if(troco>=0.5f){
                this.moeda50 = (this.moeda50 - (int) (troco/0.5f));
                troco = troco - ((int) (troco/0.5f) * 0.5f);
            }
            if(troco>=0.25f){
                this.moeda25 = (this.moeda25 - (int) (troco/0.25f));
                troco = troco - ((int) (troco/0.25f) * 25f);
            }
            if(troco>=0.10f){
                this.moeda10 = (this.moeda10 - (int) (troco/0.10f));
                troco = troco - ((int) (troco/0.10f) * 0.10f);
            }
            if(troco>=0.05f){
                this.moeda5 = (this.moeda5 - (int) (troco/0.05f));
                //troco = troco - ((int) (troco/100f) * 100f);
            }
        }catch(Exception e){
            System.out.println("Erro encontrado");
        }
    }

    public String retorna_qtd_valor(int cod){
        if(cod==1){
            return String.valueOf(this.nota100);
        }else if(cod==2){
            return String.valueOf(this.nota50);
        }else if(cod==3){
            return String.valueOf(this.nota20);
        }else if(cod==4){
            return String.valueOf(this.nota10);
        }else if(cod==5){
            return String.valueOf(this.nota5);
        }else if(cod==6){
            return String.valueOf(this.nota2);
        }else if(cod==7){
            return String.valueOf(this.moeda1);
        }else if(cod==8){
            return String.valueOf(this.moeda50);
        }else if(cod==9){
            return String.valueOf(this.moeda25);
        }else if(cod==10){
            return String.valueOf(this.moeda10);
        }else if(cod==11){
            return String.valueOf(this.moeda5);
        }
        return "Erro";
    }

    public void valor_entrada(int cod){
        switch(cod){
            case 1:
                this.auxNota100 = this.auxNota100 + 1;
                break;
            case 2:
                this.auxNota50 = this.auxNota50 + 1;
                break;
            case 3:
                this.auxNota20 = this.auxNota20 + 1;
                break;
            case 4:
                this.auxNota10 = this.auxNota10 + 1;
                break;
            case 5:
                this.auxNota5 = this.auxNota5 + 1;
                break;
            case 6:
                this.auxNota2 = this.auxNota2 + 1;
                break;
            case 7:
                this.auxMoeda1 = this.auxMoeda1 + 1;
                break;
            case 8:
                this.auxMoeda50 = this.auxMoeda50 + 1;
                break;
            case 9:
                this.auxMoeda25 = this.auxMoeda25 + 1;
                break;
            case 10:
                this.auxMoeda10 = this.auxMoeda10 + 1;
                break;
            case 11:
                this.auxMoeda5 = this.auxMoeda5 + 1;
                break;
            default:
                break;
        }
    }

    public void add_valor_entrada(){
        this.nota100 = this.nota100 + this.auxNota100;
        this.nota50 = this.nota50 + this.auxNota50;
        this.nota20 = this.nota20 + this.auxNota20;
        this.nota10 = this.nota10 + this.auxNota10;
        this.nota5 = this.nota5 + this.auxNota5;
        this.nota2 = this.nota2 + this.auxNota2;
        this.moeda1 = this.moeda1 + this.auxMoeda1;
        this.moeda50 = this.moeda50 + this.auxMoeda50;
        this.moeda25 = this.moeda25 + this.auxMoeda25;
        this.moeda10 = this.moeda10 + this.auxMoeda10;
        this.moeda5 = this.moeda5 + this.auxMoeda5;
    }
    
    public void limpa_valor_entrada(){
        this.auxNota100 = 0;
        this.auxNota50 = 0;
        this.auxNota20 = 0;
        this.auxNota10 = 0;
        this.auxNota5 = 0;
        this.auxNota2 = 0;
        this.auxMoeda1 = 0;
        this.auxMoeda50 = 0;
        this.auxMoeda25 = 0;
        this.auxMoeda10 = 0;
        this.auxMoeda5 = 0;
    }
            
}
    
    
    