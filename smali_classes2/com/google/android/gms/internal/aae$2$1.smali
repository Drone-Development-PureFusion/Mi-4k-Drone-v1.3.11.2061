.class Lcom/google/android/gms/internal/aae$2$1;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/acr$c;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aae$2;->run()V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation

.annotation system Ldalvik/annotation/Signature;
    value = {
        "Ljava/lang/Object;",
        "Lcom/google/android/gms/internal/acr$c",
        "<",
        "Lcom/google/android/gms/internal/wy;",
        ">;"
    }
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/ul;

.field final synthetic b:Lcom/google/android/gms/internal/aae$2;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/aae$2;Lcom/google/android/gms/internal/ul;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aae$2$1;->b:Lcom/google/android/gms/internal/aae$2;

    iput-object p2, p0, Lcom/google/android/gms/internal/aae$2$1;->a:Lcom/google/android/gms/internal/ul;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/wy;)V
    .locals 5

    iget-object v0, p0, Lcom/google/android/gms/internal/aae$2$1;->b:Lcom/google/android/gms/internal/aae$2;

    iget-object v0, v0, Lcom/google/android/gms/internal/aae$2;->c:Lcom/google/android/gms/internal/un;

    iget-object v1, p0, Lcom/google/android/gms/internal/aae$2$1;->a:Lcom/google/android/gms/internal/ul;

    const/4 v2, 0x1

    new-array v2, v2, [Ljava/lang/String;

    const/4 v3, 0x0

    const-string v4, "jsf"

    aput-object v4, v2, v3

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/un;->a(Lcom/google/android/gms/internal/ul;[Ljava/lang/String;)Z

    iget-object v0, p0, Lcom/google/android/gms/internal/aae$2$1;->b:Lcom/google/android/gms/internal/aae$2;

    iget-object v0, v0, Lcom/google/android/gms/internal/aae$2;->c:Lcom/google/android/gms/internal/un;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/un;->b()V

    const-string v0, "/invalidRequest"

    iget-object v1, p0, Lcom/google/android/gms/internal/aae$2$1;->b:Lcom/google/android/gms/internal/aae$2;

    iget-object v1, v1, Lcom/google/android/gms/internal/aae$2;->b:Lcom/google/android/gms/internal/aag;

    iget-object v1, v1, Lcom/google/android/gms/internal/aag;->b:Lcom/google/android/gms/internal/vt;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/wy;->a(Ljava/lang/String;Lcom/google/android/gms/internal/vt;)V

    const-string v0, "/loadAdURL"

    iget-object v1, p0, Lcom/google/android/gms/internal/aae$2$1;->b:Lcom/google/android/gms/internal/aae$2;

    iget-object v1, v1, Lcom/google/android/gms/internal/aae$2;->b:Lcom/google/android/gms/internal/aag;

    iget-object v1, v1, Lcom/google/android/gms/internal/aag;->c:Lcom/google/android/gms/internal/vt;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/wy;->a(Ljava/lang/String;Lcom/google/android/gms/internal/vt;)V

    const-string v0, "/loadAd"

    iget-object v1, p0, Lcom/google/android/gms/internal/aae$2$1;->b:Lcom/google/android/gms/internal/aae$2;

    iget-object v1, v1, Lcom/google/android/gms/internal/aae$2;->b:Lcom/google/android/gms/internal/aag;

    iget-object v1, v1, Lcom/google/android/gms/internal/aag;->d:Lcom/google/android/gms/internal/vt;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/wy;->a(Ljava/lang/String;Lcom/google/android/gms/internal/vt;)V

    :try_start_0
    const-string v0, "AFMA_getAd"

    iget-object v1, p0, Lcom/google/android/gms/internal/aae$2$1;->b:Lcom/google/android/gms/internal/aae$2;

    iget-object v1, v1, Lcom/google/android/gms/internal/aae$2;->e:Ljava/lang/String;

    invoke-interface {p1, v0, v1}, Lcom/google/android/gms/internal/wy;->a(Ljava/lang/String;Ljava/lang/String;)V
    :try_end_0
    .catch Ljava/lang/Exception; {:try_start_0 .. :try_end_0} :catch_0

    :goto_0
    return-void

    :catch_0
    move-exception v0

    const-string v1, "Error requesting an ad url"

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/abr;->b(Ljava/lang/String;Ljava/lang/Throwable;)V

    goto :goto_0
.end method

.method public synthetic a(Ljava/lang/Object;)V
    .locals 0

    check-cast p1, Lcom/google/android/gms/internal/wy;

    invoke-virtual {p0, p1}, Lcom/google/android/gms/internal/aae$2$1;->a(Lcom/google/android/gms/internal/wy;)V

    return-void
.end method
