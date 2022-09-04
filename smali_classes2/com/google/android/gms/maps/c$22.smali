.class Lcom/google/android/gms/maps/c$22;
.super Lcom/google/android/gms/maps/a/y$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/maps/c;->a(Lcom/google/android/gms/maps/c$b;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/maps/c$b;

.field final synthetic b:Lcom/google/android/gms/maps/c;


# direct methods
.method constructor <init>(Lcom/google/android/gms/maps/c;Lcom/google/android/gms/maps/c$b;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/maps/c$22;->b:Lcom/google/android/gms/maps/c;

    iput-object p2, p0, Lcom/google/android/gms/maps/c$22;->a:Lcom/google/android/gms/maps/c$b;

    invoke-direct {p0}, Lcom/google/android/gms/maps/a/y$a;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/maps/model/a/g;)Lcom/google/android/gms/c/e;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/maps/c$22;->a:Lcom/google/android/gms/maps/c$b;

    new-instance v1, Lcom/google/android/gms/maps/model/g;

    invoke-direct {v1, p1}, Lcom/google/android/gms/maps/model/g;-><init>(Lcom/google/android/gms/maps/model/a/g;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/c$b;->a(Lcom/google/android/gms/maps/model/g;)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v0

    return-object v0
.end method

.method public b(Lcom/google/android/gms/maps/model/a/g;)Lcom/google/android/gms/c/e;
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/maps/c$22;->a:Lcom/google/android/gms/maps/c$b;

    new-instance v1, Lcom/google/android/gms/maps/model/g;

    invoke-direct {v1, p1}, Lcom/google/android/gms/maps/model/g;-><init>(Lcom/google/android/gms/maps/model/a/g;)V

    invoke-interface {v0, v1}, Lcom/google/android/gms/maps/c$b;->b(Lcom/google/android/gms/maps/model/g;)Landroid/view/View;

    move-result-object v0

    invoke-static {v0}, Lcom/google/android/gms/c/f;->a(Ljava/lang/Object;)Lcom/google/android/gms/c/e;

    move-result-object v0

    return-object v0
.end method
