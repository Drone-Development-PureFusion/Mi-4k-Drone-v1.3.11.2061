.class Lcom/google/android/gms/internal/apb$1;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/apb;->a(Ljava/lang/String;JLjava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/apa;

.field final synthetic b:J

.field final synthetic c:Ljava/lang/String;

.field final synthetic d:Ljava/lang/String;

.field final synthetic e:Ljava/lang/String;

.field final synthetic f:Ljava/util/Map;

.field final synthetic g:Ljava/lang/String;

.field final synthetic h:Lcom/google/android/gms/internal/apb;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/apb;Lcom/google/android/gms/internal/apa;JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V
    .locals 1

    iput-object p1, p0, Lcom/google/android/gms/internal/apb$1;->h:Lcom/google/android/gms/internal/apb;

    iput-object p2, p0, Lcom/google/android/gms/internal/apb$1;->a:Lcom/google/android/gms/internal/apa;

    iput-wide p3, p0, Lcom/google/android/gms/internal/apb$1;->b:J

    iput-object p5, p0, Lcom/google/android/gms/internal/apb$1;->c:Ljava/lang/String;

    iput-object p6, p0, Lcom/google/android/gms/internal/apb$1;->d:Ljava/lang/String;

    iput-object p7, p0, Lcom/google/android/gms/internal/apb$1;->e:Ljava/lang/String;

    iput-object p8, p0, Lcom/google/android/gms/internal/apb$1;->f:Ljava/util/Map;

    iput-object p9, p0, Lcom/google/android/gms/internal/apb$1;->g:Ljava/lang/String;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 9

    iget-object v0, p0, Lcom/google/android/gms/internal/apb$1;->h:Lcom/google/android/gms/internal/apb;

    invoke-static {v0}, Lcom/google/android/gms/internal/apb;->a(Lcom/google/android/gms/internal/apb;)Lcom/google/android/gms/internal/apc;

    move-result-object v0

    if-nez v0, :cond_0

    invoke-static {}, Lcom/google/android/gms/internal/apu;->b()Lcom/google/android/gms/internal/apu;

    move-result-object v0

    iget-object v1, p0, Lcom/google/android/gms/internal/apb$1;->h:Lcom/google/android/gms/internal/apb;

    invoke-static {v1}, Lcom/google/android/gms/internal/apb;->b(Lcom/google/android/gms/internal/apb;)Landroid/content/Context;

    move-result-object v1

    iget-object v2, p0, Lcom/google/android/gms/internal/apb$1;->a:Lcom/google/android/gms/internal/apa;

    invoke-virtual {v0, v1, v2}, Lcom/google/android/gms/internal/apu;->a(Landroid/content/Context;Lcom/google/android/gms/internal/apa;)V

    iget-object v1, p0, Lcom/google/android/gms/internal/apb$1;->h:Lcom/google/android/gms/internal/apb;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/apu;->c()Lcom/google/android/gms/internal/apc;

    move-result-object v0

    invoke-static {v1, v0}, Lcom/google/android/gms/internal/apb;->a(Lcom/google/android/gms/internal/apb;Lcom/google/android/gms/internal/apc;)Lcom/google/android/gms/internal/apc;

    :cond_0
    iget-object v0, p0, Lcom/google/android/gms/internal/apb$1;->h:Lcom/google/android/gms/internal/apb;

    invoke-static {v0}, Lcom/google/android/gms/internal/apb;->a(Lcom/google/android/gms/internal/apb;)Lcom/google/android/gms/internal/apc;

    move-result-object v1

    iget-wide v2, p0, Lcom/google/android/gms/internal/apb$1;->b:J

    iget-object v4, p0, Lcom/google/android/gms/internal/apb$1;->c:Ljava/lang/String;

    iget-object v5, p0, Lcom/google/android/gms/internal/apb$1;->d:Ljava/lang/String;

    iget-object v6, p0, Lcom/google/android/gms/internal/apb$1;->e:Ljava/lang/String;

    iget-object v7, p0, Lcom/google/android/gms/internal/apb$1;->f:Ljava/util/Map;

    iget-object v8, p0, Lcom/google/android/gms/internal/apb$1;->g:Ljava/lang/String;

    invoke-interface/range {v1 .. v8}, Lcom/google/android/gms/internal/apc;->a(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Map;Ljava/lang/String;)V

    return-void
.end method
