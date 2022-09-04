.class final Lcom/google/android/gms/internal/pn$13;
.super Ljava/lang/Object;

# interfaces
.implements Lcom/google/android/gms/internal/ok;


# annotations
.annotation system Ldalvik/annotation/EnclosingMethod;
    value = Lcom/google/android/gms/internal/pn;->a(Lcom/google/android/gms/internal/po;Lcom/google/android/gms/internal/oj;)Lcom/google/android/gms/internal/ok;
.end annotation

.annotation system Ldalvik/annotation/InnerClass;
    accessFlags = 0x8
    name = null
.end annotation


# instance fields
.field final synthetic a:Lcom/google/android/gms/internal/po;

.field final synthetic b:Lcom/google/android/gms/internal/oj;


# direct methods
.method constructor <init>(Lcom/google/android/gms/internal/po;Lcom/google/android/gms/internal/oj;)V
    .locals 0

    iput-object p1, p0, Lcom/google/android/gms/internal/pn$13;->a:Lcom/google/android/gms/internal/po;

    iput-object p2, p0, Lcom/google/android/gms/internal/pn$13;->b:Lcom/google/android/gms/internal/oj;

    invoke-direct {p0}, Ljava/lang/Object;-><init>()V

    return-void
.end method


# virtual methods
.method public a(Lcom/google/android/gms/internal/nr;Lcom/google/android/gms/internal/po;)Lcom/google/android/gms/internal/oj;
    .locals 1
    .annotation system Ldalvik/annotation/Signature;
        value = {
            "<T:",
            "Ljava/lang/Object;",
            ">(",
            "Lcom/google/android/gms/internal/nr;",
            "Lcom/google/android/gms/internal/po",
            "<TT;>;)",
            "Lcom/google/android/gms/internal/oj",
            "<TT;>;"
        }
    .end annotation

    iget-object v0, p0, Lcom/google/android/gms/internal/pn$13;->a:Lcom/google/android/gms/internal/po;

    invoke-virtual {p2, v0}, Lcom/google/android/gms/internal/po;->equals(Ljava/lang/Object;)Z

    move-result v0

    if-eqz v0, :cond_0

    iget-object v0, p0, Lcom/google/android/gms/internal/pn$13;->b:Lcom/google/android/gms/internal/oj;

    :goto_0
    return-object v0

    :cond_0
    const/4 v0, 0x0

    goto :goto_0
.end method
