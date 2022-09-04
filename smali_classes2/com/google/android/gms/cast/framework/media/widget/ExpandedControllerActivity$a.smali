.class Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity$a;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/cast/framework/media/c$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingClass;
    value = Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x2
    name = "a"
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;


# direct methods
.method private constructor <init>(Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity$a;->a:Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method

.method synthetic constructor <init>(Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity$1;)V
    .locals 0

    invoke-direct {p0, p1}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity$a;-><init>(Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;)V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity$a;->a:Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->a(Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;)Lcom/google/android/gms/cast/framework/media/c;

    move-result-object v0

    if-eqz v0, :cond_0

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/c;->t()Z

    move-result v0

    if-nez v0, :cond_1

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity$a;->a:Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;

    invoke-virtual {v0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->finish()V

    :goto_0
    return-void

    :cond_1
    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity$a;->a:Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->b(Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;)V

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity$a;->a:Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->c(Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;)V

    goto :goto_0
.end method

.method public b()V
    .locals 1

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity$a;->a:Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->d(Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;)V

    return-void
.end method

.method public c()V
    .locals 0

    return-void
.end method

.method public d()V
    .locals 0

    return-void
.end method

.method public e()V
    .locals 3

    iget-object v0, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity$a;->a:Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;

    invoke-static {v0}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->e(Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;)Landroid/widget/TextView;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity$a;->a:Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;

    invoke-virtual {v1}, Lcom/google/android/gms/cast/framework/media/widget/ExpandedControllerActivity;->getResources()Landroid/content/res/Resources;

    move-result-object v1

    sget v2, Lcom/google/android/gms/R$string;->cast_expanded_controller_loading:I

    invoke-virtual {v1, v2}, Landroid/content/res/Resources;->getString(I)Ljava/lang/String;

    move-result-object v1

    invoke-virtual {v0, v1}, Landroid/widget/TextView;->setText(Ljava/lang/CharSequence;)V

    return-void
.end method
