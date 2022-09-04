.class Lcom/google/android/gms/tagmanager/ce$2;
.super Ljava/lang/Object;

# interfaces
.implements Ljava/lang/Runnable;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/tagmanager/ce;->a(Lcom/google/android/gms/internal/el$a;)V
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/el$a;

.field final synthetic b:Lcom/google/android/gms/tagmanager/ce;


# direct methods
.method constructor <init>(Lcom/google/android/gms/tagmanager/ce;Lcom/google/android/gms/internal/el$a;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/tagmanager/ce$2;->b:Lcom/google/android/gms/tagmanager/ce;

    iput-object p2, p0, Lcom/google/android/gms/tagmanager/ce$2;->a:Lcom/google/android/gms/internal/el$a;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public run()V
    .locals 2

    iget-object v0, p0, Lcom/google/android/gms/tagmanager/ce$2;->b:Lcom/google/android/gms/tagmanager/ce;

    iget-object v1, p0, Lcom/google/android/gms/tagmanager/ce$2;->a:Lcom/google/android/gms/internal/el$a;

    invoke-virtual {v0, v1}, Lcom/google/android/gms/tagmanager/ce;->b(Lcom/google/android/gms/internal/el$a;)Z

    return-void
.end method
