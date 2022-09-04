.class Lcom/google/android/gms/internal/wx$d$2;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/acr$a;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/wx$d;->w_()Lcom/google/android/gms/internal/wx$c;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x0
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/wx$c;

.field final synthetic b:Lcom/google/android/gms/internal/wx$d;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/wx$d;Lcom/google/android/gms/internal/wx$c;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/wx$d$2;->b:Lcom/google/android/gms/internal/wx$d;

    iput-object p2, p0, Lcom/google/android/gms/internal/wx$d$2;->a:Lcom/google/android/gms/internal/wx$c;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a()V
    .locals 1

    const-string v0, "Rejecting reference for JS Engine."

    invoke-static {v0}, Lcom/google/android/gms/internal/abr;->e(Ljava/lang/String;)V

    iget-object v0, p0, Lcom/google/android/gms/internal/wx$d$2;->a:Lcom/google/android/gms/internal/wx$c;

    invoke-virtual {v0}, Lcom/google/android/gms/internal/wx$c;->a()V

    return-void
.end method
