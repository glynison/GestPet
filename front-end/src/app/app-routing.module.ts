import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { CadastrarComponent } from './cadastrar/cadastrar.component';
import { CarrinhoComponent } from './carrinho/carrinho.component';
import { ClienteContatosComponent } from './cliente-contatos/cliente-contatos.component';
import { ClienteDadosComponent } from './cliente-dados/cliente-dados.component';
import { ClienteEnderecoComponent } from './cliente-endereco/cliente-endereco.component';
import { ClienteFavoritoComponent } from './cliente-favoritos/cliente-favorito.component';
import { ClientePedidosComponent } from './cliente-pedidos/cliente-pedidos.component';
import { ClienteSenhaComponent } from './cliente-senha/cliente-senha.component';
import { ClienteComponent } from './cliente/cliente.component';
import { FechamentoEnderecoComponent } from './fechamento-endereco/fechamento-endereco.component';
import { FechamentoPagamentoComponent } from './fechamento-pagamento/fechamento-pagamento.component';
import { FechamentoPedidoComponent } from './fechamento-pedido/fechamento-pedido.component';
import { HomeComponent } from './home/home.component';
import { LoginComponent } from './login/login.component';
import { RecuperarSenhaComponent } from './recuperar-senha/recuperar-senha.component';

const routes: Routes = [
  {path: '',component: HomeComponent},
  {path: 'cadastra', component: CadastrarComponent},
  {path: 'carrinho', component: CarrinhoComponent},
  {path: 'login', component: LoginComponent },
  {path: 'recuperar-senha', component: RecuperarSenhaComponent },
  {path: 'fechamento-endereco', component: FechamentoEnderecoComponent  },
  {path: 'fechamento-pagamento', component: FechamentoPagamentoComponent  },
  {path: 'fechamento-pedido', component: FechamentoPedidoComponent  },
  {path: 'cliente', component: ClienteComponent},
  {path: 'cliente-contatos', component: ClienteContatosComponent},
  {path: 'cliente-dados', component: ClienteDadosComponent},
  {path: 'cliente-endereco', component: ClienteEnderecoComponent},
  {path: 'cliente-favoritos', component: ClienteFavoritoComponent},
  {path: 'cliente-pedidos', component: ClientePedidosComponent},
  {path: 'cliente-senha', component: ClienteSenhaComponent}
 
 


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
