.class Lcom/fimi/soul/view/a$b$2;
.super Ljava/lang/Object;

# interfaces
.implements Landroid/view/View$OnClickListener;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/fimi/soul/view/a$b;->a()Lcom/fimi/soul/view/a;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/fimi/soul/view/a$b;


# direct methods
.method constructor <init>(Lcom/fimi/soul/view/a$b;)V
    .locals 0

    iput-object p1, p0, Lcom/fimi/soul/view/a$b$2;->a:Lcom/fimi/soul/view/a$b;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public onClick(Landroid/view/View;)V
    .locals 4

    iget-object v0, p0, Lcom/fimi/soul/view/a$b$2;->a:Lcom/fimi/soul/view/a$b;

    iget-object v1, p0, Lcom/fimi/soul/view/a$b$2;->a:Lcom/fimi/soul/view/a$b;

    invoke-static {v1}, Lcom/fimi/soul/view/a$b;->b(Lcom/fimi/soul/view/a$b;)Landroid/widget/Button;

    move-result-object v1

    const/16 v2, 0x66

    const v3, 0x7f0f001e

    invoke-virtual {v0, v1, v2, v3}, Lcom/fimi/soul/view/a$b;->a(Landroid/widget/Button;II)V

    iget-object v0, p0, Lcom/fimi/soul/view/a$b$2;->a:Lcom/fimi/soul/view/a$b;

    iget-object v1, p0, Lcom/fimi/soul/view/a$b$2;->a:Lcom/fimi/soul/view/a$b;

    invoke-static {v1}, Lcom/fimi/soul/view/a$b;->b(Lcom/fimi/soul/view/a$b;)Landroid/widget/Button;

    move-result-object v1

    const v2, 0x7f02018f

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/a$b;->a(Landroid/widget/Button;I)V

    iget-object v0, p0, Lcom/fimi/soul/view/a$b$2;->a:Lcom/fimi/soul/view/a$b;

    iget-object v1, p0, Lcom/fimi/soul/view/a$b$2;->a:Lcom/fimi/soul/view/a$b;

    invoke-static {v1}, Lcom/fimi/soul/view/a$b;->a(Lcom/fimi/soul/view/a$b;)Landroid/widget/Button;

    move-result-object v1

    const/16 v2, 0xff

    const v3, 0x7f0f0084

    invoke-virtual {v0, v1, v2, v3}, Lcom/fimi/soul/view/a$b;->a(Landroid/widget/Button;II)V

    iget-object v0, p0, Lcom/fimi/soul/view/a$b$2;->a:Lcom/fimi/soul/view/a$b;

    iget-object v1, p0, Lcom/fimi/soul/view/a$b$2;->a:Lcom/fimi/soul/view/a$b;

    invoke-static {v1}, Lcom/fimi/soul/view/a$b;->a(Lcom/fimi/soul/view/a$b;)Landroid/widget/Button;

    move-result-object v1

    const v2, 0x7f020192

    invoke-virtual {v0, v1, v2}, Lcom/fimi/soul/view/a$b;->a(Landroid/widget/Button;I)V

    iget-object v0, p0, Lcom/fimi/soul/view/a$b$2;->a:Lcom/fimi/soul/view/a$b;

    invoke-static {v0}, Lcom/fimi/soul/view/a$b;->c(Lcom/fimi/soul/view/a$b;)Landroid/widget/TextView;

    move-result-object v0

    const v1, 0x7f0b050b

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(I)V

    iget-object v0, p0, Lcom/fimi/soul/view/a$b$2;->a:Lcom/fimi/soul/view/a$b;

    invoke-static {v0}, Lcom/fimi/soul/view/a$b;->d(Lcom/fimi/soul/view/a$b;)Landroid/widget/ImageView;

    move-result-object v0

    const v1, 0x7f020069

    invoke-virtual {v0, v1}, Landroid/widget/ImageView;->setImageResource(I)V

    iget-object v0, p0, Lcom/fimi/soul/view/a$b$2;->a:Lcom/fimi/soul/view/a$b;

    invoke-static {v0}, Lcom/fimi/soul/view/a$b;->e(Lcom/fimi/soul/view/a$b;)Lcom/fimi/soul/biz/g/a;

    move-result-object v0

    const/4 v1, 0x2

    invoke-virtual {v0, v1}, Lcom/fimi/soul/biz/g/a;->a(I)V

    return-void
.end method
