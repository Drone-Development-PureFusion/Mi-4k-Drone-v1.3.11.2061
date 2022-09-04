.class final Lcom/google/android/gms/internal/aae$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/aae;->a(Landroid/content/Context;Lcom/google/android/gms/internal/wx;Lcom/google/android/gms/internal/ty;Lcom/google/android/gms/internal/aad;Lcom/google/android/gms/ads/internal/request/AdRequestInfoParcel;)Lcom/google/android/gms/ads/internal/request/AdResponseParcel;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/wx;

.field final synthetic b:Lcom/google/android/gms/internal/aag;

.field final synthetic c:Lcom/google/android/gms/internal/un;

.field final synthetic d:Lcom/google/android/gms/internal/ul;

.field final synthetic e:Ljava/lang/String;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/wx;Lcom/google/android/gms/internal/aag;Lcom/google/android/gms/internal/un;Lcom/google/android/gms/internal/ul;Ljava/lang/String;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/aae$2;->a:Lcom/google/android/gms/internal/wx;

    iput-object p2, p0, Lcom/google/android/gms/internal/aae$2;->b:Lcom/google/android/gms/internal/aag;

    iput-object p3, p0, Lcom/google/android/gms/internal/aae$2;->c:Lcom/google/android/gms/internal/un;

    iput-object p4, p0, Lcom/google/android/gms/internal/aae$2;->d:Lcom/google/android/gms/internal/ul;

    iput-object p5, p0, Lcom/google/android/gms/internal/aae$2;->e:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 6

    iget-object v0, p0, Lcom/google/android/gms/internal/aae$2;->a:Lcom/google/android/gms/internal/wx;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wx;->a()Lcom/google/android/gms/internal/wx$c;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/aae$2;->b:Lcom/google/android/gms/internal/aag;

    invoke-virtual {v1, v0}, Lcom/google/android/gms/internal/aag;->a(Lcom/google/android/gms/internal/wx$c;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/aae$2;->c:Lcom/google/android/gms/internal/un;

    iget-object v2, p0, Lcom/google/android/gms/internal/aae$2;->d:Lcom/google/android/gms/internal/ul;

    const/4 v3, 0x1

    new-array v3, v3, [Ljava/lang/String;

    const/4 v4, 0x0

    const-string v5, "rwc"

    aput-object v5, v3, v4

    invoke-virtual {v1, v2, v3}, Lcom/google/android/gms/internal/un;->a(Lcom/google/android/gms/internal/ul;[Ljava/lang/String;)Z

    iget-object v1, p0, Lcom/google/android/gms/internal/aae$2;->c:Lcom/google/android/gms/internal/un;

    invoke-virtual {v1}, Lcom/google/android/gms/internal/un;->a()Lcom/google/android/gms/internal/ul;

    move-result-object v1

    new-instance v2, Lcom/google/android/gms/internal/aae$2$1;

    invoke-direct {v2, p0, v1}, Lcom/google/android/gms/internal/aae$2$1;-><init>(Lcom/google/android/gms/internal/aae$2;Lcom/google/android/gms/internal/ul;)V

    new-instance v1, Lcom/google/android/gms/internal/aae$2$2;

    invoke-direct {v1, p0}, Lcom/google/android/gms/internal/aae$2$2;-><init>(Lcom/google/android/gms/internal/aae$2;)V

    invoke-virtual {v0, v2, v1}, Lcom/google/android/gms/internal/wx$c;->a(Lcom/google/android/gms/internal/acr$c;Lcom/google/android/gms/internal/acr$a;)V

    return-void
.end method
